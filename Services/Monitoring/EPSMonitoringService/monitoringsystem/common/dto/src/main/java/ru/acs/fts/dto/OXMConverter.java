package ru.acs.fts.dto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import ru.acs.fts.dto.soap.ObjectFactory;

/**
 * Класс для маршаллинга/демаршаллинга XML
 * 
 * @author fmv
 * 
 */
public class OXMConverter {
	public static JAXBContext jaxbContext = null;

	public OXMConverter() throws MarshallMessageException {
		try {
			if (jaxbContext == null){
				jaxbContext = JAXBContext.newInstance("ru.acs.fts.dto.soap");
				jaxbContext = JAXBContext.newInstance(new Class[]{ObjectFactory.class,ru.acs.fts.dto.soap.ext.ObjectFactory.class,ru.acs.fts.dto.monitoring.ObjectFactory.class});
			}
		} catch (JAXBException e) {
			throw new MarshallMessageException("Ошибка инициализации JAXB: "
					+ e.getMessage(), e);
		}
	}

	public Object unmarshall(InputStream is) throws UnmarshallMessageException {
		try {
			return getUnmarshaller().unmarshal(is);
		} catch (JAXBException e) {
			throw new UnmarshallMessageException("Ошибка разбора XML: "
					+ e.getMessage(), e);
		}
	}

	
	public Object unmarshall(byte[] content) throws UnmarshallMessageException {
		InputStream is = new ByteArrayInputStream(content);
		return unmarshall(is);

	}

	private Unmarshaller getUnmarshaller() throws JAXBException {
		return jaxbContext.createUnmarshaller();
	}

	public void marshall(Object o, ByteArrayOutputStream bos)
			throws MarshallMessageException {

		try {
			Marshaller m = getMarshaller();

			/*
			 * if (!(o instanceof JAXBElement)) o = getJAXBElement(o);
			 */
			m.marshal(o, bos);
		} catch (JAXBException e) {
			throw new MarshallMessageException("Ошибка создания XML: "
					+ e.getMessage(), e);
		}

	}

	
	public byte[] marshall(Object obj){
		ByteArrayOutputStream bos = new ByteArrayOutputStream();		
		marshall(obj, bos);
		return bos.toByteArray();
	}

	public Marshaller getMarshaller() throws JAXBException {
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		try {
			m.setProperty("com.sun.xml.bind.namespacePrefixMapper",
					new NamespacePrefixMapperImpl());
		} catch (PropertyException e) {
			// if the JAXB provider doesn't recognize the prefix mapper,
			// it will throw this exception. Since being unable to specify
			// a human friendly prefix is not really a fatal problem,
			// you can just continue marshalling without failing
		}
		return m;
	}

	@SuppressWarnings("unchecked")
	public static synchronized JAXBElement getJAXBElement(Object ed)
			throws UnmarshallMessageException {
		String className = ed.getClass().getName().substring(
				ed.getClass().getName().lastIndexOf(".") + 1);
		if (className.endsWith("Type"))
			className = className.substring(0, className.length() - 4);
		String packageName = ed.getClass().getName().substring(0,
				ed.getClass().getName().lastIndexOf("."));
		try {
			Class[] paramTypes = { Class.forName(ed.getClass().getName()) };

			Class klass = Class.forName(packageName + ".ObjectFactory");

			java.lang.reflect.Method createMethod = klass.getMethod("create"
					+ className, paramTypes);

			JAXBElement jaxbEl = (JAXBElement) createMethod.invoke(klass
					.newInstance(), ed);
			return jaxbEl;
		} catch (Exception e) {
			throw new UnmarshallMessageException(
					"Ошибка создания получение объекта: " + e.getMessage(), e);
		}

	}

}
