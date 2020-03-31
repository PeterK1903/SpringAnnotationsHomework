package com.example.codeclan.fileSystemHomework.components;

import com.example.codeclan.fileSystemHomework.models.File;
import com.example.codeclan.fileSystemHomework.models.Folder;
import com.example.codeclan.fileSystemHomework.models.User;
import com.example.codeclan.fileSystemHomework.repositories.FileRepository;
import com.example.codeclan.fileSystemHomework.repositories.FolderRepository;
import com.example.codeclan.fileSystemHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User peter = new User("Peter");
        userRepository.save(peter);
        User paul = new User("Paul");
        userRepository.save(paul);
        User emma = new User("Emma");
        userRepository.save(emma);

        Folder photos = new Folder("Photos", peter);
        folderRepository.save(photos);
        Folder videos = new Folder("Video", paul);
        folderRepository.save(videos);
        Folder notes = new Folder("Notes", emma);
        folderRepository.save(notes);

        File holidaypic1 = new File("Mountains", "jpeg", photos);
        fileRepository.save(holidaypic1);
        File holidayvideo1 = new File("Ocean", "jpeg", videos);
        fileRepository.save(holidayvideo1);
        File holidayreview1 = new File("Hotel Review", "txt", notes);
        fileRepository.save(holidayreview1);




//            jack.addRaid(raid1);
//            jack.addRaid(raid2);
//            pirateRepository.save(jack);
//            raid2.addPirate(john);
//            raidRepository.save(raid2);
//            raid3.addPirate(pugwash);
//            raid3.addPirate(maggie);
//            raidRepository.save(raid3);
//            raid4.addPirate(pugwash);
//            raid3.addPirate(jack);
//            raidRepository.save(raid4);
//            blackbeard.addRaid(raid5);
//            blackbeard.addRaid(raid6);
//            pirateRepository.save(blackbeard);
//            raid5.addPirate(william);
//            raidRepository.save(raid5);


    }

}
