package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "journal_entries")
@Data // Includes Getters, Setters, toString, equals, hashCode
@NoArgsConstructor
public class JournalEntry {
    @Id //this annotation maps id as primary key
    private ObjectId id;
    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;

    private User user;
}