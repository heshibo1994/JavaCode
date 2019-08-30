package alibaba;

public class ExceptionTest {
    public static void main(String[] args) {
//        if(checkPassPort()) {
//
//        }
        try {
            System.out.println("leaving hotel.");
            System.out.println("get taxi");
            System.out.println("on the way");
            System.out.println("waiting for the plane ");
            System.out.println("boarding.");
//            if(boss.call()) {
//                throw InterruptedByYourBossException();
//            }
        } catch (PassPortNotBringException e) {
            System.out.println("Oh my god, passport left in hotel.");
        } catch(EarthQuakeError e) {
            System.out.println("earthquake!");
        } catch (TrafficJamException e) {
            System.out.println("helocopter! or run!");
        } catch (OnDutyComputerException e) {
            System.out.println("check machine broke!");
        }
    }
}

class PassPortNotBringException extends RuntimeException {}

class EarthQuakeError extends Error{}

class TrafficJamException extends RuntimeException{}

class OnDutyComputerException extends RuntimeException{}

class InterruptedByYourBossException extends Exception {}

class WatchBrokenException extends Exception {}
