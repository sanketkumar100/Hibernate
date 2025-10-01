package org.example;

import jakarta.persistence.*;

@Entity
public class ProfilePicture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;   // image name or description

    @Lob                      // Large Object (for binary data)
    @Column(length = 100000)  // optional: define max size
    private byte[] imageData;

    public ProfilePicture() {}

    public ProfilePicture(String name, byte[] imageData) {
        this.name = name;
        this.imageData = imageData;
    }

    // getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public byte[] getImageData() { return imageData; }
    public void setImageData(byte[] imageData) { this.imageData = imageData; }
}
