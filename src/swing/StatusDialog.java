package swing;

public class StatusDialog {
    private int status = 1;
    private String[] stats = {"covered", "flag", "questionMark", "uncovered"};
    public void leftClick(){
        switch (status){
            case 1:
                status = 4;
                break;
            case 3:
                status = 4;
                break;
            default:
                break;
        }   
    }
    
    public void rightClick(){
        switch (status){
            case 1:
                status = 2;
                break;
            case 2:
                status = 3;
                break;
            case 3:
                status = 1;
                break;
            default:
                break;
        }
    }

    public int getStatus() {
        return status;
    }
}
