public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(3);
    }
        public static int toMilesPerHour(int kilometersperhour){
            if(kilometersperhour>0){
               return Math.round( kilometersperhour/2);

            }
            return -1;
        }

}
