package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class Presidente extends Colleague {
    private String position;
    private String name;
    private Integer id;

    public Presidente(IServicioDeMensajes mediator, String position, String name, Integer id) {
        super(mediator);
        this.position = position;
        this.name = name;
        this.id = id;
    }

    @Override
    public void send(String message) {
        servicioDeMensajes.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("--INFO - *****Message Received**** -- "+ position + " , "+ name +"\n  >> " + message);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }}
