package OOP.studentfore;

import OOP.studentThird.ExThirdAuto;

import java.util.Iterator;

public class AutomibileList {
    private ExForeAuto FirstAuto;  //ссылка на первый автомобиль
    private int AutoCount;          //
    private String CompName;        //
    private float SumAutomobile;
    private boolean pravda;
    private String infoStr;
    private ExForeAuto info;

    public AutomibileList(String compName) //создание пустого списка машин
    {
        CompName = compName;
        AutoCount = 0;
    }


    public int getAutoCount(){
        return AutoCount;
    }

    public String getCompName(){
        return CompName;
    }


    public ExForeAuto getFirstAuto()
    {
        return FirstAuto;
    }

    public void AddAuto(String _GosNumber)
    {
        FirstAuto = new ExForeAuto(_GosNumber,FirstAuto);
        AutoCount += 1;
    }

    /* public boolean delAuto() //удаление элемента, для задания не требуется
    {
        if (FirstAuto != null)
        {
          pravda = true;
          FirstAuto = FirstAuto.get_nextCar();
        }
        else pravda = false;
    return pravda;
    }*/

    public String FindAutoData(String _GosNumber)
    {

        ExForeAuto CurrentAuto = FirstAuto;
        while (CurrentAuto != null)
        {
            if (CurrentAuto.getGosNumber() == _GosNumber)
            {
                return infoStr = CurrentAuto.getData();
            }
            else {CurrentAuto = CurrentAuto.get_nextCar();}
        }
        return infoStr;
    }

    public ExForeAuto FindAuto(String _GosNumber)
    {

        ExForeAuto CurrentAuto = FirstAuto;
        while (CurrentAuto != null)
        {
            if (CurrentAuto.getGosNumber() == _GosNumber)
            {
                return info = CurrentAuto;
            }
            else {CurrentAuto = CurrentAuto.get_nextCar();}
        }
        return info;
    }


    public float SumCompany(){

        while(FirstAuto.get_nextCar() != null) {
            SumAutomobile += FirstAuto.setSumSold();
        }
        return SumAutomobile;
    }


    public String getDataCompany(){
        StringBuilder data = new StringBuilder();
        while(FirstAuto.get_nextCar() != null) {
            data.append("\n").append(FirstAuto.getData());
        }
        return data.toString();
    }














}
