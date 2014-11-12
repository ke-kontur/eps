package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "SERVICE_DOCUMENT" )
public class ServiceDocument
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Column( name = "NUMBER_", nullable = true, length = 255 )
	private String number;
	
	@Column( name = "TYPE_", nullable = true, length = 255 )
	private String type;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATIONDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDate;
	
	@Column( name = "COMMENTARY", nullable = true, length = 255 )
	private String comment;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATIONDATESTART", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDateStart;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATIONDATEEND", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDateEnd;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setNumber( String number ) { this.number = number; }
	public String getNumber( ) { return number; }
	
	public void setType( String type ) { this.type = type; }
	public String getType( ) { return type; }
	
	public void setCreationDate( Timestamp creationDate ) { this.creationDate = creationDate; }
	public Timestamp getCreationDate( ) { return creationDate; }
	
	public void setComment( String comment ) { this.comment = comment; }
	public String getComment( ) { return comment; }
	
	public void setCreationDateStart( Timestamp creationDateStart ) { this.creationDateStart = creationDateStart; }
	public Timestamp getCreationDateStart( ) { return creationDateStart; }
	
	public void setCreationDateEnd( Timestamp creationDateEnd ) { this.creationDateEnd = creationDateEnd; }
	public Timestamp getCreationDateEnd( ) { return creationDateEnd; }
	// @formatter:on
	
	// From C#
	
	/*
    [DataMember]
    public TrackableCollection<DESTRUCTION_REGISTER> DESTRUCTION_REGISTER
    {
        get
        {
            if (_dESTRUCTION_REGISTER == null)
            {
                _dESTRUCTION_REGISTER = new TrackableCollection<DESTRUCTION_REGISTER>();
                _dESTRUCTION_REGISTER.CollectionChanged += FixupDESTRUCTION_REGISTER;
            }
            return _dESTRUCTION_REGISTER;
        }
        set
        {
            if (!ReferenceEquals(_dESTRUCTION_REGISTER, value))
            {
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    throw new InvalidOperationException("Cannot set the FixupChangeTrackingCollection when ChangeTracking is enabled");
                }
                if (_dESTRUCTION_REGISTER != null)
                {
                    _dESTRUCTION_REGISTER.CollectionChanged -= FixupDESTRUCTION_REGISTER;
                }
                _dESTRUCTION_REGISTER = value;
                if (_dESTRUCTION_REGISTER != null)
                {
                    _dESTRUCTION_REGISTER.CollectionChanged += FixupDESTRUCTION_REGISTER;
                }
                OnNavigationPropertyChanged("DESTRUCTION_REGISTER");
            }
        }
    }
    private TrackableCollection<DESTRUCTION_REGISTER> _dESTRUCTION_REGISTER;

    [DataMember]
    public TrackableCollection<EXPERT_REGISTER> EXPERT_REGISTER
    {
        get
        {
            if (_eXPERT_REGISTER == null)
            {
                _eXPERT_REGISTER = new TrackableCollection<EXPERT_REGISTER>();
                _eXPERT_REGISTER.CollectionChanged += FixupEXPERT_REGISTER;
            }
            return _eXPERT_REGISTER;
        }
        set
        {
            if (!ReferenceEquals(_eXPERT_REGISTER, value))
            {
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    throw new InvalidOperationException("Cannot set the FixupChangeTrackingCollection when ChangeTracking is enabled");
                }
                if (_eXPERT_REGISTER != null)
                {
                    _eXPERT_REGISTER.CollectionChanged -= FixupEXPERT_REGISTER;
                }
                _eXPERT_REGISTER = value;
                if (_eXPERT_REGISTER != null)
                {
                    _eXPERT_REGISTER.CollectionChanged += FixupEXPERT_REGISTER;
                }
                OnNavigationPropertyChanged("EXPERT_REGISTER");
            }
        }
    }
    private TrackableCollection<EXPERT_REGISTER> _eXPERT_REGISTER;

    [DataMember]
    public TrackableCollection<RETENTION_CONTROL_REGISTER> RETENTION_CONTROL_REGISTER
    {
        get
        {
            if (_rETENTION_CONTROL_REGISTER == null)
            {
                _rETENTION_CONTROL_REGISTER = new TrackableCollection<RETENTION_CONTROL_REGISTER>();
                _rETENTION_CONTROL_REGISTER.CollectionChanged += FixupRETENTION_CONTROL_REGISTER;
            }
            return _rETENTION_CONTROL_REGISTER;
        }
        set
        {
            if (!ReferenceEquals(_rETENTION_CONTROL_REGISTER, value))
            {
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    throw new InvalidOperationException("Cannot set the FixupChangeTrackingCollection when ChangeTracking is enabled");
                }
                if (_rETENTION_CONTROL_REGISTER != null)
                {
                    _rETENTION_CONTROL_REGISTER.CollectionChanged -= FixupRETENTION_CONTROL_REGISTER;
                }
                _rETENTION_CONTROL_REGISTER = value;
                if (_rETENTION_CONTROL_REGISTER != null)
                {
                    _rETENTION_CONTROL_REGISTER.CollectionChanged += FixupRETENTION_CONTROL_REGISTER;
                }
                OnNavigationPropertyChanged("RETENTION_CONTROL_REGISTER");
            }
        }
    }
    private TrackableCollection<RETENTION_CONTROL_REGISTER> _rETENTION_CONTROL_REGISTER;

    [DataMember]
    public TrackableCollection<SIGNATURE_CONTROL_REGISTER> SIGNATURE_CONTROL_REGISTER
    {
        get
        {
            if (_sIGNATURE_CONTROL_REGISTER == null)
            {
                _sIGNATURE_CONTROL_REGISTER = new TrackableCollection<SIGNATURE_CONTROL_REGISTER>();
                _sIGNATURE_CONTROL_REGISTER.CollectionChanged += FixupSIGNATURE_CONTROL_REGISTER;
            }
            return _sIGNATURE_CONTROL_REGISTER;
        }
        set
        {
            if (!ReferenceEquals(_sIGNATURE_CONTROL_REGISTER, value))
            {
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    throw new InvalidOperationException("Cannot set the FixupChangeTrackingCollection when ChangeTracking is enabled");
                }
                if (_sIGNATURE_CONTROL_REGISTER != null)
                {
                    _sIGNATURE_CONTROL_REGISTER.CollectionChanged -= FixupSIGNATURE_CONTROL_REGISTER;
                }
                _sIGNATURE_CONTROL_REGISTER = value;
                if (_sIGNATURE_CONTROL_REGISTER != null)
                {
                    _sIGNATURE_CONTROL_REGISTER.CollectionChanged += FixupSIGNATURE_CONTROL_REGISTER;
                }
                OnNavigationPropertyChanged("SIGNATURE_CONTROL_REGISTER");
            }
        }
    }
    private TrackableCollection<SIGNATURE_CONTROL_REGISTER> _sIGNATURE_CONTROL_REGISTER;

    #endregion
    #region ChangeTracking

    protected virtual void OnPropertyChanged(String propertyName)
    {
        if (ChangeTracker.State != ObjectState.Added && ChangeTracker.State != ObjectState.Deleted)
        {
            ChangeTracker.State = ObjectState.Modified;
        }
        if (_propertyChanged != null)
        {
            _propertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }
    }

    protected virtual void OnNavigationPropertyChanged(String propertyName)
    {
        if (_propertyChanged != null)
        {
            _propertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }
    }

    event PropertyChangedEventHandler INotifyPropertyChanged.PropertyChanged{ add { _propertyChanged += value; } remove { _propertyChanged -= value; } }
    private event PropertyChangedEventHandler _propertyChanged;
    private ObjectChangeTracker _changeTracker;

    [DataMember]
    public ObjectChangeTracker ChangeTracker
    {
        get
        {
            if (_changeTracker == null)
            {
                _changeTracker = new ObjectChangeTracker();
                _changeTracker.ObjectStateChanging += HandleObjectStateChanging;
            }
            return _changeTracker;
        }
        set
        {
            if(_changeTracker != null)
            {
                _changeTracker.ObjectStateChanging -= HandleObjectStateChanging;
            }
            _changeTracker = value;
            if(_changeTracker != null)
            {
                _changeTracker.ObjectStateChanging += HandleObjectStateChanging;
            }
        }
    }

    private void HandleObjectStateChanging(object sender, ObjectStateChangingEventArgs e)
    {
        if (e.NewState == ObjectState.Deleted)
        {
            ClearNavigationProperties();
        }
    }

    protected bool IsDeserializing { get; private set; }

    [OnDeserializing]
    public void OnDeserializingMethod(StreamingContext context)
    {
        IsDeserializing = true;
    }

    [OnDeserialized]
    public void OnDeserializedMethod(StreamingContext context)
    {
        IsDeserializing = false;
        ChangeTracker.ChangeTrackingEnabled = true;
    }

    protected virtual void ClearNavigationProperties()
    {
        DESTRUCTION_REGISTER.Clear();
        EXPERT_REGISTER.Clear();
        RETENTION_CONTROL_REGISTER.Clear();
        SIGNATURE_CONTROL_REGISTER.Clear();
    }

    #endregion
    #region Association Fixup

    private void FixupDESTRUCTION_REGISTER(object sender, NotifyCollectionChangedEventArgs e)
    {
        if (IsDeserializing)
        {
            return;
        }

        if (e.NewItems != null)
        {
            foreach (DESTRUCTION_REGISTER item in e.NewItems)
            {
                item.SERVICE_DOCUMENT = this;
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    if (!item.ChangeTracker.ChangeTrackingEnabled)
                    {
                        item.StartTracking();
                    }
                    ChangeTracker.RecordAdditionToCollectionProperties("DESTRUCTION_REGISTER", item);
                }
            }
        }

        if (e.OldItems != null)
        {
            foreach (DESTRUCTION_REGISTER item in e.OldItems)
            {
                if (ReferenceEquals(item.SERVICE_DOCUMENT, this))
                {
                    item.SERVICE_DOCUMENT = null;
                }
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    ChangeTracker.RecordRemovalFromCollectionProperties("DESTRUCTION_REGISTER", item);
                }
            }
        }
    }

    private void FixupEXPERT_REGISTER(object sender, NotifyCollectionChangedEventArgs e)
    {
        if (IsDeserializing)
        {
            return;
        }

        if (e.NewItems != null)
        {
            foreach (EXPERT_REGISTER item in e.NewItems)
            {
                item.SERVICE_DOCUMENT = this;
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    if (!item.ChangeTracker.ChangeTrackingEnabled)
                    {
                        item.StartTracking();
                    }
                    ChangeTracker.RecordAdditionToCollectionProperties("EXPERT_REGISTER", item);
                }
            }
        }

        if (e.OldItems != null)
        {
            foreach (EXPERT_REGISTER item in e.OldItems)
            {
                if (ReferenceEquals(item.SERVICE_DOCUMENT, this))
                {
                    item.SERVICE_DOCUMENT = null;
                }
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    ChangeTracker.RecordRemovalFromCollectionProperties("EXPERT_REGISTER", item);
                }
            }
        }
    }

    private void FixupRETENTION_CONTROL_REGISTER(object sender, NotifyCollectionChangedEventArgs e)
    {
        if (IsDeserializing)
        {
            return;
        }

        if (e.NewItems != null)
        {
            foreach (RETENTION_CONTROL_REGISTER item in e.NewItems)
            {
                item.SERVICE_DOCUMENT = this;
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    if (!item.ChangeTracker.ChangeTrackingEnabled)
                    {
                        item.StartTracking();
                    }
                    ChangeTracker.RecordAdditionToCollectionProperties("RETENTION_CONTROL_REGISTER", item);
                }
            }
        }

        if (e.OldItems != null)
        {
            foreach (RETENTION_CONTROL_REGISTER item in e.OldItems)
            {
                if (ReferenceEquals(item.SERVICE_DOCUMENT, this))
                {
                    item.SERVICE_DOCUMENT = null;
                }
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    ChangeTracker.RecordRemovalFromCollectionProperties("RETENTION_CONTROL_REGISTER", item);
                }
            }
        }
    }

    private void FixupSIGNATURE_CONTROL_REGISTER(object sender, NotifyCollectionChangedEventArgs e)
    {
        if (IsDeserializing)
        {
            return;
        }

        if (e.NewItems != null)
        {
            foreach (SIGNATURE_CONTROL_REGISTER item in e.NewItems)
            {
                item.SERVICE_DOCUMENT = this;
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    if (!item.ChangeTracker.ChangeTrackingEnabled)
                    {
                        item.StartTracking();
                    }
                    ChangeTracker.RecordAdditionToCollectionProperties("SIGNATURE_CONTROL_REGISTER", item);
                }
            }
        }

        if (e.OldItems != null)
        {
            foreach (SIGNATURE_CONTROL_REGISTER item in e.OldItems)
            {
                if (ReferenceEquals(item.SERVICE_DOCUMENT, this))
                {
                    item.SERVICE_DOCUMENT = null;
                }
                if (ChangeTracker.ChangeTrackingEnabled)
                {
                    ChangeTracker.RecordRemovalFromCollectionProperties("SIGNATURE_CONTROL_REGISTER", item);
                }
            }
        }
    }
	*/

}
