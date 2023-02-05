// 1:25 ~ 1:33
function solution(arr1, arr2) {
    const result = [];
    arr1.forEach((row, rowIndex) => {
        const newRow = [];
        row.forEach((column, columnIndex) => {
            newRow.push(column + arr2[rowIndex][columnIndex])
        })
        result.push(newRow);
    })
    
    return result;
}