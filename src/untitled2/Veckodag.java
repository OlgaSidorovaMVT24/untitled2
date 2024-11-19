package untitled2;

public class Veckodag {

    public void getVeckodag (int dag)  {

        switch (dag)  {

            case 1 :
                System.out.println(" är Måndag");
                break;
            case 2 :
                System.out.println("är Tisdag");
                break;
            case 3 :
                System.out.println("är Onsdad");
                break;
            case 4 :
                System.out.println("är Torsdag");
                break;
            case 5 :
                System.out.println("är Fredag");
                break;
            case 6 :
                System.out.println("är Lördag");
                break;
            case 7 :
                System.out.println("är Söndag");
                break;
            default :
                System.out.println("Fel siffra");
        }
    }


}
