public class Data {
    private int zi;
    private int luna;
    private int an;


    public int getZi() {
        return zi;
    }

    public int getLuna() {
        return luna;
    }

    public int getAn() {
        return an;
    }

    public int setLuna(int luna) {
        if (luna <= 0 || luna > 12)
            System.out.println("Luna nu poate fi " + luna);
        else this.luna = luna;
        return luna;
    }

    public int setAn(int an) {
        if (an <= 1900 || an > 2023)
            System.out.println("Anul nu poate fi " + an);
        else this.an = an;
        return an;
    }

    public int setZi(int zi) {
        NumDays dd = new NumDays();
        dd.month = this.luna;
        dd.year = this.an;
      dd.getDays(this.luna, this.an);
        System.out.println(this.luna+" "+ this.an);
        System.out.println(dd.getDays(this.luna, this.an));

        if (zi <= dd.getDays(dd.month,dd.year))
            return this.zi=zi;
        else return 0;
    }
}



//    private boolean validzi(int zi){
//        boolean b;
//       switch (this.luna) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                if (zi <= 31)  b=true;
//                else b = false;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//               if (zi <= 30) b=true;
//               else b = false;
//                break;
//            case 2:
//                if(zi <= 28) b=true;
//                else b = false;
//                break;
//            default:
//                System.out.println("Invalid " + luna);
//                break;
//        }
//        return validzi(zi);
//    }






