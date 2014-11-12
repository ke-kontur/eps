package ru.acs.fts.aud.result.dispatcher.savers;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;

public interface IResponseSaver
{
	public void saveResponse( AudMessage msg, AudResponseMetadata metadata, EdeclAudCommand currentCommand ) throws Exception;
}
