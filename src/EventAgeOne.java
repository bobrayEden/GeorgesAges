import java.util.Random;

public class EventAgeOne {


    private Random rand;
    private String name;
    private String description;
    private String eventType;
    private String outputTrue;
    private String outputFalse;
    private double output1;
    private double output2;
    private boolean local;
    private boolean eventStatus;

    public EventAgeOne (String name, String description, String eventType, boolean local, double output1, String outputTrue, double output2, String outputFalse) {
        this.name = name;
        this.description = description;
        this.eventType = eventType;
        this.local = local;
        this.output1 = output1;
        this.outputTrue = outputTrue;
        this.output2 = output2;
        this.outputFalse = outputFalse;
        this.eventStatus = false;
    }

    public EventAgeOne (String name, String description, String eventType, boolean local, double output1, String outputTrue, double output2, String outputFalse, boolean eventStatus
    ) {
        this.name = name;
        this.description = description;
        this.eventType = eventType;
        this.local = local;
        this.output1 = output1;
        this.outputTrue = outputTrue;
        this.output2 = output2;
        this.outputFalse = outputFalse;
        this.eventStatus = eventStatus;
    }

    public String getOutputTrue() {
        return outputTrue;
    }

    public void setOutputTrue(String outputTrue) {
        this.outputTrue = outputTrue;
    }

    public String getOutputFalse() {
        return outputFalse;
    }

    public void setOutputFalse(String outputFalse) {
        this.outputFalse = outputFalse;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public double getOutput1() {
        return output1;
    }

    public void setOutput1(double output1) {
        this.output1 = output1;
    }

    public double getOutput2() {
        return output2;
    }

    public void setOutput2(double output2) {
        this.output2 = output2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public boolean isEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(boolean eventStatus) {
        this.eventStatus = eventStatus;
    }
}
