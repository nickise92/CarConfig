package univr.ing.carconfig;

public abstract class Impiegato {
    // Necessario per differenziare tra amministrazione e venditori
    // ID che inizia per N negoziante
    // ID che iniza per A amministratore
    private String userID;
    private boolean admin;

    public Impiegato(String id) {
        setUserID(id);
    }

    private void setUserID(String id) {
        this.userID = id;

        if (userID.toUpperCase().charAt(0) == 'A') {
            this.admin = true;
        } else {
            this.admin = false;
        }
    }

    public void viewOrder() {
        /*if (this.admin) {
            //TODO: può vedere tutti i preventivi nel sistema
            System.out.println("Admin!");
        } else {
            //TODO: può vedere i preventivi della sua concessionaria
            System.out.println("Venditore!");
        }*/

    }

/*  IDEA di test da automatizzare
    public static void main(String[] args) {
        Negoziante test = new Negoziante("A121");
        Negoziante test2 = new Negoziante("N121");

        test.viewOrder();
        test2.viewOrder();
    }*/
}
