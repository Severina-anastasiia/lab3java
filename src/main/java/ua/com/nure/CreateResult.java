package ua.com.nure;

public class CreateResult {

    private static final String[] nation = {"україн", "росіян", "нім" ,"англічан"};
    private StringBuilder builder = new StringBuilder();

    public String result(String town, String sex){
        switch (town){
            case "Kiev":
                chooseEnd(0, sex);
                return builder.toString();
            case "Moscow":
                chooseEnd(1, sex);
                return builder.toString();
            case "Berlin":
                chooseEnd(2, sex);
                return builder.toString();
            case "London":
                chooseEnd(3, sex);
                return builder.toString();
            default:
                return "You are really stupid. You can choose something wrong when the was default value";
        }
    }

    private void chooseEnd(int number, String sex){
        builder.append("Вы - ");
        builder.append(nation[number]);
        switch (sex){
            case "female":
                builder.append("ка");
                break;
            case "male":
                if(number == 0 || number == 2)
                    builder.append("ець");
                if(number == 1 || number == 3)
                    builder.append("ин");
                break;
        }
    }
}
