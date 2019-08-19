package fr.ustephan.tripmanager.infrastructure.converter;

/**
 * @author ugho_stephan.
 */
public interface BaseConverter <domain, model> {

    domain toDomain(model model);
    model toModel(domain domain);
}
