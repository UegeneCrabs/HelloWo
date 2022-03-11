package OOP.studentfore;

import java.util.Arrays;

public class ExForeAuto {

        private ExForeAuto _nextCar;

        private static String _GosNumber;

        public static float _Toplivo = 0;

        private static float sum = 0;

        private static float[] Rachod = new float[7];

        private static int index = 0;

        private static int Kolvo = 0;


    public ExForeAuto(String GosNumber,ExForeAuto nextCar) {
            if (!GosNumber.isEmpty()) {this._GosNumber = GosNumber;}
            _nextCar = null;
    }

    public ExForeAuto get_nextCar(){return _nextCar;}

    public void set_nextCar(ExForeAuto nextCar)
    {
        _nextCar = nextCar;
    }

    public static String getGosNumber() {return _GosNumber;}

    public static void setGosNumber(String GosNumber) {
        if (!GosNumber.isEmpty()) {
            _GosNumber = GosNumber;}
        else {System.out.println("this String is empty");}
    }

    public float getToplivo() {return this._Toplivo;}

    public float getRachod(float _Toplivo,int i){
        if (_Toplivo < 0) {return -1;}
        else {return Rachod[i];}
    }

    public float[] getRachod(){
        return Rachod;
    }

    public static float setRachod(float NewToplivo, int index){
        if (index < 10 && NewToplivo >= 0 && NewToplivo <= 300){
            return Rachod[index] = NewToplivo;}
        else {return -1;}
    }

    public static boolean addRachod(float NewToplivo){

        if (Rachod.length <= 10 && NewToplivo >= 0 && NewToplivo <= 300){
            Kolvo++;
            Rachod[index] = NewToplivo;
            index++;
            return true;
        }
        else {return false;}
    }

    public static float setSumSold(){
        sum = 0;
        for (int i = 0; i < 7;i++){
            sum = sum + Rachod[i];
        }
        return sum;
    }

    public static String getData(){
        String GosNum = "\nГос номер: " + getGosNumber();
        GosNum = GosNum + "\nИспользование топлива по дням: " + Arrays.toString(getDate());
        GosNum = GosNum + "\nСуммарное количество потраченного топлива за " + Kolvo + " дня: " + setSumSold();
        return GosNum;
    }

    public static float[] getDate(){
        return Rachod;
    }
    }




