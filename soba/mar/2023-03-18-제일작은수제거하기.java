package mar;

class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length - 1];
        int[] isEmpty = {-1};

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == tmp[0]) {
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return arr.length == 1 ? isEmpty : answer;
    }
}