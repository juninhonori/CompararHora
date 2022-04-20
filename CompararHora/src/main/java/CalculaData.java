import java.util.*;
import java.text.*;

class CalculaData {
    public static void main(String[] args) throws ParseException {
        // Dando um exemplo: quantos dias se passam?
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1 = df.parse ("18/04/2021 12:00");
        System.out.println (d1);

        Date d2 = df.parse ("18/04/2022 18:00");
        System.out.println (d2);

        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
        System.out.println (dt / 86400000L + " dias"); // passaram-se 67111 dias
    }
}

