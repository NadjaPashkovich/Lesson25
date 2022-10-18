package by.itstep.pashka.model.logic;

import by.itstep.pashka.model.entity.abstracts.Transport;

public class GasStation {
    public static int calcTotalOil(Transport[] transports) {

        int  total =0;
        for (Transport transport: transports) {
            total+= transport.getTank();

        }
            return total;
        }
    }

