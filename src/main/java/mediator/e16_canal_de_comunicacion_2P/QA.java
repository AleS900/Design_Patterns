package mediator.e16_canal_de_comunicacion_2P;

public class QA extends Colleague {
    private String qa_position;
    private String qa_name;
    private Integer qa_id;
    private String qa_grade;

    public QA(ICanalDeComunicacion mediator, String qa_position, String qa_name, Integer qa_id, String qa_grade) {
        super(mediator);
        this.qa_position = qa_position;
        this.qa_name = qa_name;
        this.qa_id = qa_id;
        this.qa_grade = qa_grade;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("--INFO - *****Message Received**** -- "+ qa_position + " , " + qa_grade + " " + qa_name + "\n  >> " + message);
    }

    public String getQAPosition() {
        return qa_position;
    }

    public void setQAPosition(String qa_position) {
        this.qa_position = qa_position;
    }

    public String getQAName() {
        return qa_name;
    }

    public void setQAName(String qa_name) {
        this.qa_name = qa_name;
    }

    public Integer getQAID() {
        return qa_id;
    }

    public void setQAID(Integer qa_id) {
        this.qa_id = qa_id;
    }

    public String getQAGrade() {
        return qa_grade;
    }

    public void setQAGrade(String qa_grade) {
        this.qa_grade = qa_grade;
    }
}
