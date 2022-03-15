package OOP.student4;

public class CompanyList {

    private OneAuto FirstAuto;
    private int AutoCount = 0;
    private String CompName;
    private float SumAutomobile;
    private boolean pravda;
    private String infoStr;
    private OneAuto info;


    public CompanyList(String aCompName)
    {
        CompName = aCompName;
        FirstAuto = null;
    }

    public OneAuto getFirstAuto()
    {
        return FirstAuto;
    }

    public void AddAuto(String aStateNumber)
    {
        OneAuto newAuto = new OneAuto(aStateNumber);
        if (FirstAuto == null) {
        FirstAuto = new OneAuto(aStateNumber);
        AutoCount += 1;
    } else {
            OneAuto temp = FirstAuto;
            while (temp.getNextAuto() != null) {
                temp = temp.getNextAuto();
            }
            temp.setNextAuto(newAuto);
        }
    }


    public OneAuto FindAuto(String aStateNumber)
    {
        OneAuto CurrentAuto = FirstAuto;
        while (CurrentAuto != null)
        {
            if (CurrentAuto.getGosNumber().equals(aStateNumber))
            {
                info = CurrentAuto;
                break;
            }
            else {CurrentAuto = CurrentAuto.getNextAuto();
            info = null;}
        }
        return info;
    }


    public String SumCompany(){

        StringBuilder data = new StringBuilder();
        OneAuto SumhAuto = FirstAuto;
        while(SumhAuto != null) {
            SumAutomobile += SumhAuto.setSumSold();
            SumhAuto = SumhAuto.getNextAuto();
        }
        data.append("\n").append(SumAutomobile);

        return data.toString();
    }


    public String getDataCompany(){
        StringBuilder data = new StringBuilder();
        OneAuto SearchAuto = FirstAuto;
        while(SearchAuto != null) {
            data.append("\n").append(SearchAuto.getData());
            SearchAuto = SearchAuto.getNextAuto();
        }
        return data.toString();
    }
}
