public static double sumAdLados(double[] array){
    int sum = 0.0;

    for (int i = 0; i < array.length; i++){
        if (array[i] % 2 == 1){
            sum += array[i] * array[i]
        }
    }
    return sum;
}