void main(){
    short[] arr = {1, 4, 7, 9, -2};
    Arrays.sort(arr, 2, 5);
//    Arrays.sort
    System.out.println(Arrays.toString(arr));
}

short[] bubbleSort(short[] array){
    for(short a = 0 ; a < array.length ; a++)
        for(short i = 0 ; i < array.length - 1; i++)
            if(array[i] > array[i + 1]){
                //swap
                short temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
    return array;
}

boolean linearSearch(short[] array, short searchValue){
    for(byte i = 0 ; i < array.length ; i++){
        if(array[i] == searchValue) return true;
    }
    return false;
}