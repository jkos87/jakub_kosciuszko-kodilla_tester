public class Colors {
    enum MyColors {
        B, /* Black */
        O, /* Oragne */
        R, /* Red */
        S, /* Silver */
    }

    public static void main (String[] args){
        System.out.println("Select color: R-Red, B-Black, O-Orange, S-Silver");
        UserColors color1 = new UserColors();
        String colorFirstLetter = UserColors.getUserFirstLetter().toUpperCase();

    MyColors myColor = MyColors.valueOf(colorFirstLetter);

    switch (myColor) {
        case B:
            System.out.println("Black");
            break;
        case O:
            System.out.println("Orange");
            break;
        case R:
            System.out.println("Red");
            break;
        case S:
            System.out.println("Silver");
            break;
        }
    }
}

