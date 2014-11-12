package ru.acs.fts.dto;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * Маппер для префиксов пространств имен для Jaxb
 * @author fmv
 *
 */
public class NamespacePrefixMapperImpl extends NamespacePrefixMapper {

	@Override
	public String[] getContextualNamespaceDecls() {
		// TODO Auto-generated method stub
		return new String[]{"ed","urn:cbr-ru:ed:v2.0"};
	}

	/**
	 * Returns a preferred prefix for the given namespace URI.
	 * 
	 * This method is intended to be overrided by a derived class.
	 * 
	 * @param namespaceUri
	 *            The namespace URI for which the prefix needs to be found.
	 *            Never be null. "" is used to denote the default namespace.
	 * @param suggestion
	 *            When the content tree has a suggestion for the prefix to the
	 *            given namespaceUri, that suggestion is passed as a parameter.
	 *            Typicall this value comes from the QName.getPrefix to show the
	 *            preference of the content tree. This parameter may be null,
	 *            and this parameter may represent an already occupied prefix.
	 * @param requirePrefix
	 *            If this method is expected to return non-empty prefix. When
	 *            this flag is true, it means that the given namespace URI
	 *            cannot be set as the default namespace.
	 * 
	 * @return null if there's no prefered prefix for the namespace URI. In this
	 *         case, the system will generate a prefix for you.
	 * 
	 * Otherwise the system will try to use the returned prefix, but generally
	 * there's no guarantee if the prefix will be actually used or not.
	 * 
	 * return "" to map this namespace URI to the default namespace. Again,
	 * there's no guarantee that this preference will be honored.
	 * 
	 * If this method returns "" when requirePrefix=true, the return value will
	 * be ignored and the system will generate one.
	 */
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		// I want this namespace to be mapped to "xsi"
		if ("http://www.w3.org/2001/XMLSchema-instance".equals(namespaceUri))
			return "xsi";

		if ("http://www.w3.org/2003/05/soap-envelope".equals(namespaceUri))
			return "env";
	
		// otherwise I don't care. Just use the default suggestion, whatever it
		// may be.
		return suggestion;
	}

	/**
	 * Returns a list of namespace URIs that should be declared at the root
	 * element.
	 * <p>
	 * By default, the JAXB RI produces namespace declarations only when they
	 * are necessary, only at where they are used. Because of this lack of
	 * look-ahead, sometimes the marshaller produces a lot of namespace
	 * declarations that look redundant to human eyes. For example,
	 * 
	 * <pre>
	 * &lt;xmp&gt;
	 * &lt;?xml version=&quot;1.0&quot;?&gt;
	 * &lt;root&gt;
	 *   &lt;ns1:child xmlns:ns1=&quot;urn:foo&quot;&gt; ... &lt;/ns1:child&gt;
	 *   &lt;ns2:child xmlns:ns2=&quot;urn:foo&quot;&gt; ... &lt;/ns2:child&gt;
	 *   &lt;ns3:child xmlns:ns3=&quot;urn:foo&quot;&gt; ... &lt;/ns3:child&gt;
	 *   ...
	 * &lt;/root&gt;
	 * &lt;xmp&gt;
	 * </pre>
	 * 
	 * <p>
	 * If you know in advance that you are going to use a certain set of
	 * namespace URIs, you can override this method and have the marshaller
	 * declare those namespace URIs at the root element.
	 * <p>
	 * For example, by returning <code>new String[]{"urn:foo"}</code>, the
	 * marshaller will produce:
	 * 
	 * <pre>
	 * &lt;xmp&gt;
	 * &lt;?xml version=&quot;1.0&quot;?&gt;
	 * &lt;root xmlns:ns1=&quot;urn:foo&quot;&gt;
	 *   &lt;ns1:child&gt; ... &lt;/ns1:child&gt;
	 *   &lt;ns1:child&gt; ... &lt;/ns1:child&gt;
	 *   &lt;ns1:child&gt; ... &lt;/ns1:child&gt;
	 *   ...
	 * &lt;/root&gt;
	 * &lt;xmp&gt;
	 * </pre>
	 * 
	 * <p>
	 * To control prefixes assigned to those namespace URIs, use the
	 * {@link #getPreferredPrefix} method.
	 * 
	 * @return A list of namespace URIs as an array of {@link String}s. This
	 *         method can return a length-zero array but not null. None of the
	 *         array component can be null. To represent the empty namespace,
	 *         use the empty string <code>""</code>.
	 * 
	 * @since JAXB RI 1.0.2
	 */
//	public String[] getPreDeclaredNamespaceUris() {
//		return new String[] { "urn:abc", "urn:def" };
//	}
}
