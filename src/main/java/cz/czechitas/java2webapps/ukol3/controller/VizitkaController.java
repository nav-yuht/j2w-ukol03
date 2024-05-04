package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/vizitka")
public class VizitkaController {
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka ("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                    "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),

            new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                     null, "+420 800123456", "www.czechitas.cz"),

            new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                    "monika@czechitas.cs", "+420 800123456", "www.czechitas.cz"),

            new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                    "mirka@czechitas.cs", null, "www.czechitas.cz"),

            new Vizitka(null, "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                     null, null, "www.czechitas.cz"),

            new Vizitka(null, "Czechitas z. s.", "Václavské náměstí 837/11", "Praha 1 110 00",
                    null, null, "www.czechitas.cz")

    );
    @GetMapping("/")
    public String seznam() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("seznam", seznamVizitek);
        return "seznam";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("detail", seznamVizitek.get(id));
        return "detail";
    }


}
