
public class PoliceOfficer {
    private String name;
    private String badgeNumber;


    private boolean examine(ParkedCar car, ParkingMeter meter) {
        return car.getParkedMinutes() > meter.getPurchasedMinutes();
    }
    
    // public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter) {
    //     if (examine(car, meter)) {
    //         double fineAmount = Const.FIRST_HOUR_FINE;
    //         int overMinutes = car.getParkedMinutes() - meter.getPurchasedMinutes();
    //         int remainingMinutes = overMinutes - 60;
    //         if (remainingMinutes > 60) {
    //             int addHours = (int)Math.ceil(remainingMinutes / 60);
    //             fineAmount += addHours * Const.ADDITIONAL_HOUR_FINE;
    //         }
    //         return new ParkingTicket(car, this, fineAmount);
    //     }
    //     return null;
    // }

    public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter) {
        if (examine(car, meter)) {
            double fineAmount = Const.FIRST_HOUR_FINE;
            int overMinutes = car.getParkedMinutes() - meter.getPurchasedMinutes();
            int extraHours = Math.ceilDiv(overMinutes, 60) -1;
            if (overMinutes > 60) {
                fineAmount += extraHours * Const.ADDITIONAL_HOUR_FINE;
            }
            return new ParkingTicket(car, this, fineAmount);
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

}
