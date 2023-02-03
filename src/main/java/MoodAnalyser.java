public class MoodAnalyser {
    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {

    }

    public String analyseMood(String message) {
        try {
            if(message.contains("sad")){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
