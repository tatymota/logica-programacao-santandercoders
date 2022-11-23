public enum Mes {

    JANEIRO(1,1000),
    FEVEREIRO(2,1500),
    MARCO (3,2000),
    ABRIL(4,3000),
    MAIO(5,3500),
    JUNHO (6,4000),
    JULHO(7,4500),
    AGOSTO(8,5000.65f),
    SETEMBRO(9,600.98f),
    OUTUBRO(10,985.20f),
    NOVEMBRO(11,2890.99f),
    DEZEMBRO(12,1000.68f);

    //atributo
    private int id;
    private float valorMes;


    //construtor
    Mes (int id, float valueMes){
        this.id = id;
        this.valorMes = valueMes;

    }

    //metodo
    public static float getGastoMes(int numeroMes){
        Mes[] meses = values();
        for (int i = 0; i < meses.length; i++) {
            if(meses[i].id == numeroMes) {
                return meses[i].valorMes;
            }
        }
        return -1;
    }

}

