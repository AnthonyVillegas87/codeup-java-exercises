package collections;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    // Reserve a particular seat for our theatre class
    public boolean reserveSeat(String seatNumber) {

        // EFFICIENT JDK BINARY SEARCH PT 1
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0) {
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no set " + seatNumber);
//            return false;
//        }

        //SOURCE CODE BINARY SEARCH
        int left = 0;
        int right = seats.size() - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            System.out.println(".");
            Seat midVal = seats.get(mid);
            int compare = midVal.getSeatNumber().compareTo(seatNumber);

            if(compare < 0) {
                left = mid + 1;
            } else if(compare > 0) {
                right = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
        //BRUTE FORCE APPROACH
//        for(Seat seat : seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }



    // Return/Print out our list of seats
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }

    }



    //Private Seat inner class
    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
          if(this.reserved) {
              this.reserved = false;
              System.out.println("Reservation of seat " + seatNumber + " cancelled");
              return true;
          } else {
              return false;
          }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}
