package formatter;

import model.Classs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import service.service.IClasssService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class ClasssFormatter implements Formatter<Classs> {

    private final IClasssService classsService;

    @Autowired
    public ClasssFormatter(IClasssService classsService) {
        this.classsService=classsService;
    }

    @Override
    public Classs parse(String text, Locale locale) throws ParseException {
        Optional<Classs> provinceOptional = classsService.findById(Long.parseLong(text));
        return provinceOptional.orElse(null);
    }

    @Override
    public String print(Classs object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}