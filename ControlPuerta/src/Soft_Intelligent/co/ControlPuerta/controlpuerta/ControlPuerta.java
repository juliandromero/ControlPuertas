package Soft_Intelligent.co.ControlPuerta.controlpuerta;

public class ControlPuerta {

    private String Usuario = "";
    private String Pass = "";

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getPass() {
        return Pass;
    }

    public boolean ArregloLogIn() {
        int maxarreglo = 5;
        boolean res = true;
        String[] usuarios = new String[maxarreglo];
        String[] pass = new String[maxarreglo];

        usuarios[0] = "Julian Romero";
        usuarios[1] = "Julian Sosa";
        usuarios[2] = "Jose Jinete";
        usuarios[3] = "Luisa Suarez";
        usuarios[4] = "Admin";

        pass[0] = "123";
        pass[1] = "456";
        pass[2] = "789";
        pass[3] = "abc";
        pass[4] = "admin";
        System.out.println(Usuario);
        System.out.println(Pass);
        for (int i = 0; i < maxarreglo; i++) {

            if (usuarios[i].equals(getUsuario()) && pass[i].equals(getPass())) {

                res = true;
                break;
            } else {
                res = false;
            }
        }
        return res;
    }

}
