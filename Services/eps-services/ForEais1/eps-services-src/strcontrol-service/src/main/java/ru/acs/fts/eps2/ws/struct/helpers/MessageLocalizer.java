package ru.acs.fts.eps2.ws.struct.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageLocalizer
{
	private Map< String, String > _catch;
	private Map< String, String > _i18n;
	
	public MessageLocalizer( )
	{
		initLocalization( );
	}
	
	private void initLocalization( )
	{
		_catch = new HashMap< String, String >( );
		_i18n = new HashMap< String, String >( );
		
		_catch.put( "cvc-assess-attr", ".*" );
		_i18n.put( "cvc-assess-attr", "Ошибка!" );
		
		_catch.put( "cvc-assess-elt", ".*" );
		_i18n.put( "cvc-assess-elt", "Ошибка!" );
		
		_catch.put( "cvc-attribute.1", ".*" );
		_i18n.put( "cvc-attribute.1", "Ошибка!" );
		
		_catch.put( "cvc-attribute.2", ".*" );
		_i18n.put( "cvc-attribute.2", "Ошибка!" );
		
		_catch.put( "cvc-attribute.3", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-attribute.3", "Значение '%s' атрибута '%s' элемента '%s' не такое, как требует тип элемента." );
		
		_catch.put( "cvc-attribute.4", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-attribute.4", "Значение '%s' атрибута '%s' элемента '%s' не соответствует ограничениям." );
		
		_catch.put( "cvc-au", ".*" );
		_i18n.put( "cvc-au", "Ошибка!" );
		
		_catch.put( "cvc-complex-type.1", ".*" );
		_i18n.put( "cvc-complex-type.1", "Ошибка!" );
		
		_catch.put( "cvc-complex-type.2.1", ".*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.1", "Элемент '%s' не должен содержать символов или других элементов [дочерних узлов], потому что тип содержимого типа пустой." );
		
		_catch.put( "cvc-complex-type.2.2", ".*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.2", "Элемент '%s' не должен содержать дочерних элементов [дочерних узлов], а значение должно быть корректным." );
		
		_catch.put( "cvc-complex-type.2.3", ".*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.3", "Элемент '%s' не должен содержать символов [дочерних узлов], потому что тип содержимо только элементы." );
		
		_catch.put( "cvc-complex-type.2.4.a", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.4.a", "В элементе '%s' присутствует неверное содержимое. Ожидался один из следующих элементов '%s'." );
		
		_catch.put( "cvc-complex-type.2.4.b", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.4.b", "Содержимое элемента '%s' не полно. Отсутствует один из '%s'." );
		
		_catch.put( "cvc-complex-type.2.4.c", ".*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.4.c", "Требуется точное совпадение, однако нет объявлений для элемента '%s'." );
		
		_catch.put( "cvc-complex-type.2.4.d", ".*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.2.4.d", "Начиная с элемента '%s' появляется странное содержимое. В этой точке не ожидалось дочерних элементов." );
		
		_catch.put( "cvc-complex-type.3.1", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.3.1", "Значение '%s' атрибута '%s' элемента '%s' не верно согласно месту использования атрибута." );
		
		_catch.put( "cvc-complex-type.3.2.1", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.3.2.1", "Элемент '%s' не предполагает атрибута '%s'." );
		
		_catch.put( "cvc-complex-type.3.2.2", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.3.2.2", "Атрибут '%s' не должен появляться в элементе '%s'." );
		
		_catch.put( "cvc-complex-type.4", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.4", "Атрибут '%s' должен присутствовать в элементе '%s'." );
		
		_catch.put( "cvc-complex-type.5.1", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.5.1", "В элементе '%s' атрибут '%s' является Wild ID. Но уже существует другой Wild ID '%s'." );
		
		_catch.put( "cvc-complex-type.5.2", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.5.2", "В элементе '%s' атрибут '%s' является Wild ID. Однако уже есть атрибут '%s' из правила использования атрибутов." );
		
		_catch.put( "cvc-complex-type.5.3", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-complex-type.5.3", "Атрибут '%s' является Wild ID. Однако уже есть атрибут '%s' из правила использования атрибутов." );
		
		_catch.put( "cvc-datatype-valid.1.1", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-datatype-valid.1.1", "Значение '%s' не является валидным согласно типу '%s'." );
		
		_catch.put( "cvc-datatype-valid.1.2.1", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-datatype-valid.1.2.1", "'%s' не является валидным '%s' значением." );
		
		_catch.put( "cvc-datatype-valid.1.2.2", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-datatype-valid.1.2.2", "'%s' не является валидным значением типа списка '%s'." );
		
		_catch.put( "cvc-datatype-valid.1.2.3", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-datatype-valid.1.2.3", "'%s' не является валидным значением типа объединения '%s'." );
		
		_catch.put( "cvc-datatype-valid.2", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-datatype-valid.2", "'%s' не содержится в списке возможных значений типа '%s'." );
		
		_catch.put( "cvc-elt.1", ".*'(.*)'.*" );
		_i18n.put( "cvc-elt.1", "Не удалось найти определение элемента '%s'." );

		_catch.put( "cvc-elt.2", ".*'(.*)'.*" );
		_i18n.put( "cvc-elt.2", "{abstract} в определение элемента '%s' должен иметь значение false." );
		
		_catch.put( "cvc-elt.3.1", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.3.1", "Атрибут '%s' не должен появляться в элементе '%s', потому что {nillable} имеет значение false." );
		
		_catch.put( "cvc-elt.3.2.1", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.3.2.1", "Элемент '%s' не должен иметь дочерних символов или элементов [дочерних узлов], потому что задан '%s'." );
		
		_catch.put( "cvc-elt.3.2.2", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.3.2.2", "Не должно быть фиксированной {value constraint} для элемента '%s', потому что задан '%s'." );
		
		_catch.put( "cvc-elt.4.1", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.4.1", "Значение '%s' атрибута '%s' не является верным QName на элементе '%s'." );
		
		_catch.put( "cvc-elt.4.2", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.4.2", "Не удалось найти сопоставление типа для '%s' в элементе '%s'." );
		
		_catch.put( "cvc-elt.4.3", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.4.3", "Тип '%s' не правильно унаследован от определение типа для элемента '%s'." );
		
		_catch.put( "cvc-elt.5.1.1", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.5.1.1", "{value constraint} '%s' элемента '%s' не является правильным значением по умолчанию для типа '%s'." );
		
		_catch.put( "cvc-elt.5.1.2", ".*" );
		_i18n.put( "cvc-elt.5.1.2", "Ошибка!" );
		
		_catch.put( "cvc-elt.5.2.2.1", ".*'(.*)'.*" );
		_i18n.put( "cvc-elt.5.2.2.1", "Элемент '%s' не должен иметь информацию об элементе [дочерний узел]." );
		
		_catch.put( "cvc-elt.5.2.2.2.1", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.5.2.2.2.1", "Значение '%s' элемента '%s' не удовлетворяет фиксированным ограничениям '%s'." );
		
		_catch.put( "cvc-elt.5.2.2.2.2", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-elt.5.2.2.2.2", "Значение '%s' элемента '%s' не удовлетворяет ограничениям '%s'." );
		
		_catch.put( "cvc-elt", ".*" );
		_i18n.put( "cvc-elt", "Ошибка!" );
		
		_catch.put( "cvc-enumeration-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-enumeration-valid", "Значение '%s' не является частично-верным согласно перечислению '%s'." );
		
		_catch.put( "cvc-facet-valid", ".*" );
		_i18n.put( "cvc-facet-valid", "Ошибка!" );
		
		_catch.put( "cvc-fractionDigits-valid", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-fractionDigits-valid", "Значение '%s' с дробными знаками '%s' не является частично-верным согласно fractionDigits '%s'." );
		
		_catch.put( "cvc-id.1", ".*'(.*)'.*" );
		_i18n.put( "cvc-id.1", "Не задано ID/IDREF сопоставления для IDREF '%s'." );
		
		_catch.put( "cvc-id.2", ".*'(.*)'.*" );
		_i18n.put( "cvc-id.2", "Найдено несколько вхождений значения ID '%s'." );
		
		_catch.put( "cvc-id.3", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-id.3", "Поле ограничения '%s' сопоставлено элементу '%s', однако этот элемент не имеет простого типа." );
		
		_catch.put( "cvc-identity-constraint", ".*" );
		_i18n.put( "cvc-identity-constraint", "Ошибка!" );
		
		_catch.put( "cvc-length-valid", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-length-valid", "Значение '%s' с длиной '%s' не является частично-верным согласно длинне '%s'." );
		
		_catch.put( "cvc-maxExclusive-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-maxExclusive-valid", "Значение '%s' не является частично-верным согласно maxExclusive '%s'." );
		
		_catch.put( "cvc-maxInclusive-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-maxInclusive-valid", "Значение '%s' не является частино-верным согласно maxInclusive '%s'." );
		
		_catch.put( "cvc-maxLength-valid", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-maxLength-valid", "Значение '%s' с длиной '%s' не является частично-верным согласно maxLength '%s'." );
		
		_catch.put( "cvc-minExclusive-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-minExclusive-valid", "Значение '%s' не является частично-верным согласно minExclusive '%s'." );
		
		_catch.put( "cvc-minInclusive-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-minInclusive-valid", "Значение '%s' не является частично-верным согласно minInclusive '%s'." );
		
		_catch.put( "cvc-minLength-valid", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-minLength-valid", "Значение '%s' с длиной '%s' не является частично верным согласно minLength = '%s'." );
		
		_catch.put( "cvc-model-group", ".*" );
		_i18n.put( "cvc-model-group", "Ошибка!" );
		
		_catch.put( "cvc-particle", ".*" );
		_i18n.put( "cvc-particle", "Ошибка!" );
		
		_catch.put( "cvc-pattern-valid", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-pattern-valid", "Значение '%s' не является частично-верным согласно шаблону '%s'." );
		
		_catch.put( "cvc-resolve-instance", ".*" );
		_i18n.put( "cvc-resolve-instance", "Ошибка!" );
		
		_catch.put( "cvc-simple-type", ".*" );
		_i18n.put( "cvc-simple-type", "Ошибка!" );
		
		_catch.put( "cvc-totalDigits-valid", ".*'(.*)'.*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-totalDigits-valid", "Значение '%s' с totalDigits = '%s' не является частино-верным согласно totalDigits = '%s'." );
		
		_catch.put( "cvc-type.1", ".*" );
		_i18n.put( "cvc-type.1", "Ошибка!" );
		
		_catch.put( "cvc-type.2", ".*" );
		_i18n.put( "cvc-type.2", "Определение типа не может быть абстрактным." );
		
		_catch.put( "cvc-type.3.1.1", ".*'(.*)'.*" );
		_i18n.put( "cvc-type.3.1.1", "[атрибуты] элемента '%s' должны быть пустыми, за исключением тех [пространство имен] которых идентично http://www.w3.org/2001/XMLSchema-instance и тех [локальное имя] которых имеет один из типов, nil, schemaLocation или noNamespaceSchemaLocation." );
		
		_catch.put( "cvc-type.3.1.2", ".*'(.*)'.*" );
		_i18n.put( "cvc-type.3.1.2", "Элемент '%s' не должен иметь информации об элементе [дочерний элемент]." );
		
		_catch.put( "cvc-type.3.1.3", ".*'(.*)'.*'(.*)'.*" );
		_i18n.put( "cvc-type.3.1.3", "Значение '%s' элемента '%s' не валидно." );
		
		_catch.put( "cvc-type.3.2", ".*" );
		_i18n.put( "cvc-type.3.2", "Ошибка!" );
		
		_catch.put( "cvc-type", ".*" );
		_i18n.put( "cvc-type", "Ошибка!" );
		
		_catch.put( "cvc-wildcard", ".*" );
		_i18n.put( "cvc-wildcard", "Ошибка!" );
		
		_catch.put( "cvc-wildcard-namespace", ".*" );
		_i18n.put( "cvc-wildcard-namespace", "Ошибка!" );
	}
	
	public String localize( String msg )
	{
		for ( String key : _catch.keySet( ) )
		{
			if ( ! msg.contains( key ) )
				continue;
			
			Pattern p = Pattern.compile( _catch.get( key ) );
			Matcher m = p.matcher( msg );
			
			if ( ! m.find( ) )
				continue;
			
			List< String > parts = new ArrayList< String >( );
			int count = m.groupCount( );
			for ( int i = 1; i <= count; ++i )
				parts.add( m.group( i ) );
			
			return String.format( _i18n.get( key ), ( Object[ ] )parts.toArray( new String[ 0 ] ) );
		}
		
		return msg;
	}
}
