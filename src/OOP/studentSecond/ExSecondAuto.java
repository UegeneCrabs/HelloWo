package OOP.studentSecond;

public class ExSecondAuto {

        private String _GosNumber;

        public String Rashod;

        public float _Toplivo = 0;

        private float sum = 0;

        private final float[] Rachod;

        private int index = 0;






    public ExSecondAuto(String GosNumber) {
            if (!GosNumber.isEmpty()) {this._GosNumber = GosNumber;}
            Rachod = new float[7];
    }


    public String getGosNumber() {return this._GosNumber;}



    public void setGosNumber(String GosNumber) {
        if (!GosNumber.isEmpty()) {
            this._GosNumber = GosNumber;}
        else {System.out.println("this String is empty");}
    }


    public float getToplivo() {return this._Toplivo;}


    public float getRachod(float _Toplivo,int i){
        if (_Toplivo < 0) {return -1;}
        else {return Rachod[i];}
    }


    public float setRachod(float NewToplivo, int index){
        if (index < 10 && NewToplivo >= 0 && NewToplivo <= 300){
            return Rachod[index] = NewToplivo;}
        else {return -1;}
    }


    public boolean addRachod(float NewToplivo){
        if (Rachod.length <= 10 && NewToplivo >= 0 && NewToplivo <= 300){
            Rachod[index] = NewToplivo;
            index++;
            return true;
        }
        else {return false;}
    }


    public float setSumSold(){
        sum = 0;
        for (int i = 0; i < 7;i++){
            sum = sum + Rachod[i];
        }
        return sum;
    }


    public String getData(){
        String GosNum = "Gos Number = " + getGosNumber();
        return GosNum;
    }


    public float[] getDate(){
        return Rachod;
    }


    }

