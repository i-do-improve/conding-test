// 10:58 ~ 생각 11:30  품 ~ 11:52
// wallpaper: 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현
// 빈칸은 ".", 파일이 있는 칸은 "#"
// 드래그를 하면 파일들을 선택
// 선택된 파일들을 삭제
//  머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며
    //  드래그는 바탕화면의 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 상태로 격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행동
    // "드래그 한 거리"는 |rdx - lux| + |rdy - luy|
    // 점 S에서 점 E로 드래그를 하면 바탕화면에서 두 격자점을 각각 왼쪽 위, 오른쪽 아래로 하는 직사각형 내부에 있는 모든 파일이 선택
// 드래그의 시작점이 (lux, luy), 끝점이 (rdx, rdy)라면 정수 배열 [lux, luy, rdx, rdy]를 return
// 바탕화면에는 적어도 하나의 파일

// #가 있는 첫 row와 첫 column을 찾는다.
// 시작점은 [첫 row, 첫 column]이 되고, 끝점은 [마지막 row, 마지막 column]이 된다.
// 단 끝점은 row, column에 1씩 더한다.
// 방법
    // wallpaper를 reduce으로 돌면서 각 아이템들을 split한다. 첫 acc는 [minRow, minCol, maxRow, maxCol]으로 한다.
    // cur는 split('')하고(item, # = file) 첫 # 가 발견되면 cur의 index를 minRow에 할당
    // item includes #일 경우 cur Index + 1 > maxRow크면 maxRow에 할당
    // file의 index가 minCol보다 적을 경우 minCol에 할당.
    // file의 index + 1이 maxCol보다 클 경우 maxCol에 할당.

    
    function solution(wallpaper) {
      return wallpaper.reduce((acc, cur, rowIndex) => {
          const items = cur.split('');
          items.forEach((item, colIndex) => {
              if (item === '#') {
                  acc[0] = Math.min(rowIndex, acc[0]);
                  acc[1] = Math.min(colIndex, acc[1]);    
                  acc[2] = Math.max(rowIndex + 1, acc[2]);    
                  acc[3] = Math.max(colIndex + 1, acc[3]);    
              }
          })
          return acc;
      }, [55, 55, 0, 0]);
  }