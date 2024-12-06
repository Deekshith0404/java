package com.xworks.collection.Runner;

import com.xworks.collection.dto.ApplicationDto;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicationRunner {
    public static void main(String[] args) {


        Collection<ApplicationDto> collection=new ArrayList<>();
        collection.add(new ApplicationDto(1, "pubg", "game", "v.1.2", 25, "tencent"));
        collection.add(new ApplicationDto(2, "spotify", "music", "v.3.1", 50, "Spotify Ltd."));
        collection.add(new ApplicationDto(3, "zoom", "communication", "v.5.0", 75, "Zoom Inc."));
        collection.add(new ApplicationDto(4, "netflix", "entertainment", "v.2.8", 150, "Netflix Inc."));
        collection.add(new ApplicationDto(5, "instagram", "social", "v.4.3", 200, "Facebook Inc."));
        collection.add(new ApplicationDto(6, "whatsapp", "communication", "v.7.2", 300, "Facebook Inc."));
        collection.add(new ApplicationDto(7, "twitter", "social", "v.3.5", 120, "Twitter Inc."));
        collection.add(new ApplicationDto(8, "linkedin", "professional", "v.1.9", 100, "LinkedIn Corp."));
        collection.add(new ApplicationDto(9, "amazon", "shopping", "v.5.1", 400, "Amazon Inc."));
        collection.add(new ApplicationDto(10, "facebook", "social", "v.8.2", 350, "Facebook Inc."));
        collection.add(new ApplicationDto(11, "youtube", "entertainment", "v.6.4", 500, "Google LLC"));
        collection.add(new ApplicationDto(12, "reddit", "social", "v.9.1", 80, "Reddit Inc."));
        collection.add(new ApplicationDto(13, "tiktok", "entertainment", "v.10.5", 600, "ByteDance"));
        collection.add(new ApplicationDto(14, "pinterest", "social", "v.11.3", 90, "Pinterest Inc."));
        collection.add(new ApplicationDto(15, "snapchat", "social", "v.12.4", 250, "Snap Inc."));
        collection.add(new ApplicationDto(16, "uber", "transportation", "v.2.5", 180, "Uber Technologies Inc."));
        collection.add(new ApplicationDto(17, "airbnb", "travel", "v.3.6", 170, "Airbnb Inc."));
        collection.add(new ApplicationDto(18, "paypal", "finance", "v.4.7", 220, "PayPal Inc."));
        collection.add(new ApplicationDto(19, "googlemaps", "navigation", "v.5.8", 260, "Google LLC"));
        collection.add(new ApplicationDto(20, "microsoftteams", "communication", "v.6.9", 280,"microsoft"));


        for(ApplicationDto dto:collection){
            System.out.println("App Name:"+dto.getAppName()+"\tCompany name:"+dto.getCompanyName());
        }

    }
}
