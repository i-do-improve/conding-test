// 10:15 ~ 11:20
// 아 똥싸느라 시간 지체됐네 ;;
// 각 유저는 한 번에 한 명의 유저를 신고 ( 서로 다른 유저를 계속해서 신고 가능)
// 동일한 유저에 대한 신고 횟수는 1회로 처리
// k번 이상 신고된 유저는 게시판 이용이 정지
// 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송
// 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return

// 이중 순회 최소화. 중복 제거하는 부분은 Set으로 처리.

function 통과코드(id_list, report, k) {
    const result = id_list.map((_) => 0);
    const reporteeMap = getReporteeMap(report);
    const reportees = Object
    .values(reporteeMap)
    .filter((reporter) => reporter.size >= k)
    .flatMap((reporter) => Array.from(reporter));
    
    reportees.forEach((reportee) => {
        const foundIndex = id_list.findIndex((reporter) => reportee === reporter);
        result[foundIndex]++;
    })
    
    return result;
}

const getReporteeMap = (report) => {
    const reporteeMap = {};
    
    report.forEach((item) => {
        const [reporter, reportee] = item.split(' ');
        if (!reporteeMap[reportee]) {
            reporteeMap[reportee] = new Set();
        } 
        reporteeMap[reportee].add(reporter);
    })
    
    return reporteeMap;
} 

// report를 순회하며 [reporter, reportee]에서 reportee가 신고당한 횟수와 신고자를 map에 저장
// const reporteeMap = { [reportee]: { count, reporters: [] } };
// reporteeMap을 entries(reportees)로 돌면서 count >= k 인 것들 filter.
// result를 길이만큼 0으로 초기화.
// reportees에서 reporters를 돌면서 id_list 요소의 findIndex한다음 id_list[index]++

function 실패코드(id_list, report, k) { 
    const result = id_list.map((_) => 0);
    const reporteeMap = getReporteeMap2(report);
    const reportees = Object
    .values(reporteeMap)
    .filter((reporter) => reporter.length >= k)
    .flatMap((reporter) => reporter);
    
    reportees.forEach((reportee) => {
        const foundIndex = id_list.findIndex((reporter) => reportee === reporter);
        result[foundIndex]++;
    })
    
    return result;
}

const getReporteeMap2 = (report) => {
    const reporteeMap = {};
    
    report.forEach((item) => {
        const [reporter, reportee] = item.split(' ');
        const checkSameReporter = reporteeMap[reportee]?.includes(reporter);
        if (reporteeMap[reportee] && !checkSameReporter) {
            reporteeMap[reportee].push(reporter)
        } else {
            reporteeMap[reportee] = [reporter]
        }
    })
    return reporteeMap;
} 
