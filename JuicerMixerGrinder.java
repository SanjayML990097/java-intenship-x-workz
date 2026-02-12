public class JuicerMixerGrinder {
    public static void main(String[] args) {

        String brand = "Sansui";
        String modelId = "Allure Plus";
        String series = "Plus";
        String type = "Juicer Mixer Grinder";
        String color = "Black, Blue";

        int totalJars = 3;

        boolean isdryGrinding = true;
        boolean iswetGrinding = true;
        boolean isblending = true;
        boolean ismincing = true;
        boolean isgrating = true;
        boolean ischutneyGrinding = true;
        boolean isjuicing = true;
        double price = 1299.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model ID: " + modelId);
        System.out.println("Series: " + series);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Total Jars: " + totalJars);
        System.out.println("Dry Grinding: " + dryGrinding);
        System.out.println("Wet Grinding: " + wetGrinding);
        System.out.println("Blending: " + blending);
        System.out.println("Mincing: " + mincing);
        System.out.println("Grating: " + grating);
        System.out.println("Chutney Grinding: " + chutneyGrinding);
        System.out.println("Juicing: " + juicing);
        System.out.println("Price: ₹" + price);
    }
}
