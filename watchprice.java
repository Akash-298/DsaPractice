class WatchPriceCalculator {
    public String getWatchPrice(String watchType, int age, String gender) {
        double costPrice;
        double profitPercentage;
        double gst;

        if (watchType.equals("Titan")) {
            costPrice = 7999;
            profitPercentage = 12.5;
            gst = 7.5;
        } else if (watchType.equals("Rolex")) {
            costPrice = 10999;
            profitPercentage = 13.5;
            gst = 12.5;
        } else {
            return "Invalid Watch Type";
        }

        double billAmount = costPrice + costPrice * profitPercentage / 100 + costPrice * gst / 100;
        if (gender.equals("female")){
            billAmount -= billAmount * 2 / 100;
        }
        if (age >= 60){
            billAmount -= billAmount * 3 / 100;
        }

        return "The total bill amount is"+String.format("%.2f", billAmount);
    }
}
