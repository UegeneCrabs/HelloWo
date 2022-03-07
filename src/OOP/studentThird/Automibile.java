package OOP.studentThird;

public class Automibile {
    private ExThirdAuto[] Auto;//вот тут создание массива типа EXThirdAuto
    private int AutoCount;     //где ExThirdAuto это мой класс, где реализованы
    private int ArrSize;       //методы обьекта
    private String CompName;
    private float SumAutomobile;

    public Automibile(String compName, int StartSize){
        CompName = compName;
        ArrSize = StartSize;
        AutoCount = 0;
        Auto = new ExThirdAuto[StartSize];//тут задается начальная длина этого массива
    }

    public int getAutoCount(){
        return AutoCount;
    }

    public String getCompName(){
        return CompName;
    }

    public void setCompName(String newCompName){
        CompName = newCompName;
    }

    public ExThirdAuto getExThirdAuto(int nom) {
        if (nom > 0 && nom >= ArrSize) {return Auto[nom];}
        else return null;
    }

    public boolean setExThirdAuto(int nom, ExThirdAuto newExThirdAuto){
        if (nom > 0) {
            Auto[nom] = newExThirdAuto;
            return true;}
        else return false;
    }

    public boolean AddAuto(ExThirdAuto newExthirdAuto){
        if (ArrSize == AutoCount){
            ArrSize *= 2;
            ExThirdAuto[] tempAuto = new ExThirdAuto[ArrSize];
            for (int i = 0; i < ArrSize; i++) {
                tempAuto[i] = Auto[i];
                Auto = tempAuto;
            }
        }
        Auto[AutoCount] = newExthirdAuto;
        AutoCount += 1;
        return true;
    }

    public float SumCompany(){
        for (int i = 0; i < AutoCount; i++){
            SumAutomobile += Auto[i].setSumSold();
        }
        return SumAutomobile;
    }

    public String getDataCompany(){
        String data = "";
        for (int i = 0; i < AutoCount; i++){
            data = data +"\n" + Auto[i].getData();
        }
        return data;
    }

    public String SearchAuto(int j){
        String Poisk = "";
        for (int i = 0; i < AutoCount; i++){
            if (Auto[i] == Auto[j]) {
                Poisk = Auto[i].getData();
            }
        }
        return Poisk;
    }

    public float[] PoiskAuto(int search){
        float[] Pois = new float[7];
        for (int i = 0; i < AutoCount; i++){
            if (Auto[i] == Auto[search]) {
                Pois = Auto[i].getRachod();
            }
        }
        return Pois;
    }
}
