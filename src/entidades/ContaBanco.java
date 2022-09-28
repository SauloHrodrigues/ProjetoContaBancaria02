package entidades;

public class ContaBanco {
    private int numeroConta;
    protected String tipoConta;
    private String nomeCliente;
    private Double saldoConta;
    private Boolean statusConta;

    public ContaBanco(){
        this.saldoConta=0.0;
        this.statusConta=false;
    }


    //metodos
    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        if (tipoConta.equalsIgnoreCase("cc")){
            this.setSaldoConta(50.00);
        } else if (tipoConta.equalsIgnoreCase("cp")) {
            this.setSaldoConta(150.00);
        }else {
            System.out.println("Tipo inválido!");
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(getSaldoConta()>0){
            System.out.println("A conta tem saldo, Faça o saque antes de fechar.");
        } else if (getSaldoConta()<0) {
            System.out.println("Seu saldo esta negativo. Regularize.");
        }else {
            setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }
    public void depositar(Double valorDoDeposito){
        if (getStatusConta()==false){
            System.out.println("Conta Inativa. Procure seu gerente.");
        }else {
            setSaldoConta(getSaldoConta()+valorDoDeposito);
            System.out.println("Depósito realizado com sucesso!");
        }
    }
    public void sacar(double valorSaque){
        if(getStatusConta()){
            if(getSaldoConta()<valorSaque){
                System.out.println("Saldo insuficiente");
            }else {
                setSaldoConta(getSaldoConta()-valorSaque);
                System.out.println("Saque realizado com sucesso!");
            }
        } else{
            System.out.println("Conta inesistente ou inativa.");
        }
//cc 12 , cp 20

    }
    public void pagarTarifaMensal(){
        double tarifaContaCorrente = 12.00;
        double tarifaContaPoupanca = 20.00;
        if(getStatusConta()){
            if(getTipoConta().equalsIgnoreCase("cc") || getTipoConta().equalsIgnoreCase("cp")){
                if(getTipoConta().equalsIgnoreCase("cc") && getSaldoConta()>=tarifaContaCorrente){
                    setSaldoConta(getSaldoConta()-tarifaContaCorrente);
                }else if (getTipoConta().equalsIgnoreCase("cp") && getSaldoConta()>= tarifaContaPoupanca){
                    setSaldoConta(getSaldoConta()-tarifaContaPoupanca);
                }else {
                    System.out.println("Saldo insuficiente!");
                }
            } else{
                System.out.println("Opção digitada inválida!");
            }

        }else {
            System.out.println("Conta inativa");
        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(Boolean statusConta) {
        this.statusConta = statusConta;
    }
    public void estadoAtual(){
        System.out.println("Número da conta: "+getNumeroConta());
        System.out.println("Tipo da conta:   "+getTipoConta());
        System.out.println("Nome do cliente: "+getNomeCliente());
        System.out.println("Saldo atual:     "+getSaldoConta());
        System.out.println("Status atual:     "+getStatusConta());

    }
}
