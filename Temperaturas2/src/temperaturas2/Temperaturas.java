package temperaturas2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alberto
 */
public class Temperaturas {

    private static HashMap<String, Set<Double>> map = new HashMap();

    public boolean introducirTemperatura(String mes, Integer temperatura) {
        if (!map.containsKey(mes)) {
            map.put(mes, new HashSet<>());
            map.get(mes).add(temperatura.doubleValue());
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarMes(String mes) {
        if (map.containsKey(mes)) {
            map.remove(mes);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarTemperaturasMes(String mes) {
        if (map.containsKey(mes)) {
            map.get(mes).clear();
            return true;
        } else {
            return false;
        }
    }

    public Set<String> meses() {
        return map.keySet();

    }

    public Set<String> mesesTemperaturaMayor(Integer temperatura) {
        Set<String> mesesMayores = new HashSet();

        for (HashMap.Entry<String, Set<Double>> entry : map.entrySet()) {
            for (Double mes : entry.getValue()) {
                if (mes > temperatura) {
                    mesesMayores.add(entry.getKey());

                }
            }
        }
        return mesesMayores;
    }

    public String datosTemperaturas() {

        return map.values().toString();
    }

    public String datosTemperaturasOrdenadas() {

        List<Double> temperaturasOrdenadas = new ArrayList();

        for (Set<Double> value : map.values()) {
            temperaturasOrdenadas.addAll(value);
        }

        Collections.sort(temperaturasOrdenadas);

        return temperaturasOrdenadas.toString();

    }
}
