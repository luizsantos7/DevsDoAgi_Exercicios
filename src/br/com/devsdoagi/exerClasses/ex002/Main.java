package br.com.devsdoagi.exerClasses.ex002;

public class Main {
    public static void main(String[] args) {
        ClienteVip cv = new ClienteVip("399393", 4000, "Reinaldin");
        ClienteVip cv2 = new ClienteVip();

        cv2.exibirCliente();
        cv2.setNome("Reizinho");
        cv2.setCpf("120120120");
        cv2.setLimiteCredito(4000);
        cv2.exibirCliente();

        cv.getCpf();
        cv.setLimiteCredito(1000);
        cv.exibirCliente();
    }
}
