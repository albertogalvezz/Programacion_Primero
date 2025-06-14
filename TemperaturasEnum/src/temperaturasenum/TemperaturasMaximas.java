
package temperaturasenum;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alberto
 */
public class TemperaturasMaximas {

    HashMap<MesesEnum, Integer> map = new HashMap<>();

    public boolean introducirTemperatura(MesesEnum mes, Integer temperatura) {
        if (!map.containsKey(mes)) {
            map.put(mes, temperatura);
            return true;
        } else if (map.containsKey(mes) && map.get(mes) <= temperatura) {
            map.put(mes, temperatura);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarMes(MesesEnum mes) {
        if (map.containsKey(mes)) {
            map.remove(mes);
            return true;
        } else {
            return false;
        }
    }

    public Set<MesesEnum> meses() {
        return map.keySet();
    }

    public Set<MesesEnum> mesesTemperaturaMayor(Integer temperatura) {
        Set<MesesEnum> mes = new HashSet<>();
        for (HashMap.Entry<MesesEnum, Integer> entry : map.entrySet()) {
            if (entry.getValue() > temperatura) {
                mes.add(entry.getKey());
            }
        }
        return mes;
    }

    public String datosTemperaturas() {
        return map.values().toString();
    }
}
