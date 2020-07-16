
package org.elasticsearch.x_pack.transform.preview_transform;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.transform.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.x_pack.transform.pivot.*;

public class PreviewTransformRequest  implements XContentable<PreviewTransformRequest> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public PreviewTransformRequest setDescription(String val) { this._description = val; return this; }


  static final ParseField SOURCE = new ParseField("source");
  private TransformSource _source;
  public TransformSource getSource() { return this._source; }
  public PreviewTransformRequest setSource(TransformSource val) { this._source = val; return this; }


  static final ParseField DEST = new ParseField("dest");
  private TransformDestination _dest;
  public TransformDestination getDest() { return this._dest; }
  public PreviewTransformRequest setDest(TransformDestination val) { this._dest = val; return this; }


  static final ParseField FREQUENCY = new ParseField("frequency");
  private Time _frequency;
  public Time getFrequency() { return this._frequency; }
  public PreviewTransformRequest setFrequency(Time val) { this._frequency = val; return this; }


  static final ParseField PIVOT = new ParseField("pivot");
  private TransformPivot _pivot;
  public TransformPivot getPivot() { return this._pivot; }
  public PreviewTransformRequest setPivot(TransformPivot val) { this._pivot = val; return this; }


  static final ParseField SYNC = new ParseField("sync");
  private TransformSyncContainer _sync;
  public TransformSyncContainer getSync() { return this._sync; }
  public PreviewTransformRequest setSync(TransformSyncContainer val) { this._sync = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_description != null) {
      builder.field(DESCRIPTION.getPreferredName(), _description);
    }
    if (_source != null) {
      builder.field(SOURCE.getPreferredName());
      _source.toXContent(builder, params);
    }
    if (_dest != null) {
      builder.field(DEST.getPreferredName());
      _dest.toXContent(builder, params);
    }
    if (_frequency != null) {
      builder.field(FREQUENCY.getPreferredName());
      _frequency.toXContent(builder, params);
    }
    if (_pivot != null) {
      builder.field(PIVOT.getPreferredName());
      _pivot.toXContent(builder, params);
    }
    if (_sync != null) {
      builder.field(SYNC.getPreferredName());
      _sync.toXContent(builder, params);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public PreviewTransformRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PreviewTransformRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<PreviewTransformRequest, Void> PARSER =
    new ObjectParser<>(PreviewTransformRequest.class.getName(), false, PreviewTransformRequest::new);

  static {
    PARSER.declareString(PreviewTransformRequest::setDescription, DESCRIPTION);
    PARSER.declareObject(PreviewTransformRequest::setSource, (p, t) -> TransformSource.PARSER.apply(p, t), SOURCE);
    PARSER.declareObject(PreviewTransformRequest::setDest, (p, t) -> TransformDestination.PARSER.apply(p, t), DEST);
    PARSER.declareObject(PreviewTransformRequest::setFrequency, (p, t) -> Time.PARSER.apply(p, t), FREQUENCY);
    PARSER.declareObject(PreviewTransformRequest::setPivot, (p, t) -> TransformPivot.PARSER.apply(p, t), PIVOT);
    PARSER.declareObject(PreviewTransformRequest::setSync, (p, t) -> TransformSyncContainer.PARSER.apply(p, t), SYNC);
  }

}