package ru.acs.fts.eps2.engine.processing.helpers;

import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public interface IExternEnvelopeProcessor // NO_UCD (use default)
{
	public void process( EnvelopeType envelope, Configurator configurator, ServiceHolder serviceHolder );
}
