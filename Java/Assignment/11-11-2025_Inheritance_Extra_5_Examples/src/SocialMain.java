class SocialMediaAccount {
    String userName;
    String email;
    boolean isPublic;
    boolean isVerified;
    String countryOrigin;
    int noOfPosts;
    int noOfLikes;
    int noOfComments;
    String createdAt;
    int noOfImpressions;

    // Default Constructor
    SocialMediaAccount() {
        System.out.println("Default Constructor of SocialMediaAccount Called");
        this.userName = "Yashraj27";
        this.email = "yashraj@gmail.com";
        this.isPublic = true;
        this.isVerified = false;
        this.countryOrigin = "India";
        this.noOfPosts = 0;
        this.noOfLikes = 0;
        this.noOfComments = 0;
        this.createdAt = "11-11-2025";
        this.noOfImpressions = 0;
    }

    // Parameterized Constructor
    SocialMediaAccount(String userName, String email, boolean isPublic, boolean isVerified,
                       String countryOrigin, int posts, int likes, int comments,
                       String createdAt, int impressions) {
        System.out.println("Parameterized Constructor of SocialMediaAccount Called");
        this.userName = userName;
        this.email = email;
        this.isPublic = isPublic;
        this.isVerified = isVerified;
        this.countryOrigin = countryOrigin;
        this.noOfPosts = posts;
        this.noOfLikes = likes;
        this.noOfComments = comments;
        this.createdAt = createdAt;
        this.noOfImpressions = impressions;
    }

    // Setters & Getters
    void setUserName(String userName) { 
    	this.userName = userName; 
    }
    String getUserName() { 
    	return this.userName; 
    }

    void setEmail(String email) { 
    	this.email = email; 
    }
    String getEmail() { 
    	return this.email; 
    }

    void setIsPublic(boolean isPublic) { 
    	this.isPublic = isPublic; 
    }
    boolean getIsPublic() { 
    	return this.isPublic;
    }

    void setIsVerified(boolean isVerified) { 
    	this.isVerified = isVerified; 
    }
    boolean getIsVerified() { 
    	return this.isVerified; 
    }

    void setCountryOrigin(String countryOrigin) { 
    	this.countryOrigin = countryOrigin; 
    }
    String getCountryOrigin() { 
    	return this.countryOrigin; 
    }

    void setNoOfPosts(int posts) { 
    	this.noOfPosts = posts; 
    }
    int getNoOfPosts() { 
    	return this.noOfPosts; 
    }

    void setNoOfLikes(int likes) { 
    	this.noOfLikes = likes; 
    }
    int getNoOfLikes() { 
    	return this.noOfLikes; 
    }

    void setNoOfComments(int comments) { 
    	this.noOfComments = comments; 
    }
    int getNoOfComments() { 
    	return this.noOfComments; 
    }

    void setCreatedAt(String createdAt) { 
    	this.createdAt = createdAt; 
    }
    String getCreatedAt() { 
    	return this.createdAt; 
    }

    void setNoOfImpressions(int impressions) { 
    	this.noOfImpressions = impressions; 
    }
    int getNoOfImpressions() { 
    	return this.noOfImpressions; 
    }

    void display() {
        System.out.println("Username: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Public Account: " + this.isPublic);
        System.out.println("Verified: " + this.isVerified);
        System.out.println("Country of Origin: " + this.countryOrigin);
        System.out.println("No. of Posts: " + this.noOfPosts);
        System.out.println("No. of Likes: " + this.noOfLikes);
        System.out.println("No. of Comments: " + this.noOfComments);
        System.out.println("Created At: " + this.createdAt);
        System.out.println("No. of Impressions: " + this.noOfImpressions);
    }
} //socialmediaaccount ends here

class InstagramAccount extends SocialMediaAccount {
    int noOfFollowers;
    int noOfFollowing;
    int noOfHighlights;
    int noOfPostsArchived;
    int noOfStoriesArchived;
    int noOfAudioSaved;

    InstagramAccount() {
        super();
        System.out.println("Default Constructor of InstagramAccount Called");
        this.noOfFollowers = 0;
        this.noOfFollowing = 0;
        this.noOfHighlights = 0;
        this.noOfPostsArchived = 0;
        this.noOfStoriesArchived = 0;
        this.noOfAudioSaved = 0;
    }

    InstagramAccount(String userName, String email, boolean isPublic, boolean isVerified,
                     String countryOrigin, int posts, int likes, int comments,
                     String createdAt, int impressions,
                     int followers, int following, int highlights,
                     int postsArchived, int storiesArchived, int audioSaved) {
        super(userName, email, isPublic, isVerified, countryOrigin, posts, likes, comments, createdAt, impressions);
        System.out.println("Parameterized Constructor of InstagramAccount Called");
        this.noOfFollowers = followers;
        this.noOfFollowing = following;
        this.noOfHighlights = highlights;
        this.noOfPostsArchived = postsArchived;
        this.noOfStoriesArchived = storiesArchived;
        this.noOfAudioSaved = audioSaved;
    }

    int getNoOfFollowers() {
		return noOfFollowers;
	}

	void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}

	int getNoOfFollowing() {
		return noOfFollowing;
	}

	void setNoOfFollowing(int noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}

	int getNoOfHighlights() {
		return noOfHighlights;
	}

	void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}

	int getNoOfPostsArchived() {
		return noOfPostsArchived;
	}

	void setNoOfPostsArchived(int noOfPostsArchived) {
		this.noOfPostsArchived = noOfPostsArchived;
	}

	int getNoOfStoriesArchived() {
		return noOfStoriesArchived;
	}

	void setNoOfStoriesArchived(int noOfStoriesArchived) {
		this.noOfStoriesArchived = noOfStoriesArchived;
	}

	int getNoOfAudioSaved() {
		return noOfAudioSaved;
	}

	void setNoOfAudioSaved(int noOfAudioSaved) {
		this.noOfAudioSaved = noOfAudioSaved;
	}

	void displayInstagram() {
        System.out.println("\nInstagram Account Details");
        super.display();
        System.out.println("No. of Followers: " + this.noOfFollowers);
        System.out.println("No. of Following: " + this.noOfFollowing);
        System.out.println("No. of Highlights: " + this.noOfHighlights);
        System.out.println("No. of Posts Archived: " + this.noOfPostsArchived);
        System.out.println("No. of Stories Archived: " + this.noOfStoriesArchived);
        System.out.println("No. of Audio Saved: " + this.noOfAudioSaved);
    }
}//instagramaccount ends here

class LinkedInAccount extends SocialMediaAccount {
    int noOfConnections;
    int noOfProfileViews;
    int noOfJobsApplied;

    LinkedInAccount() {
        super();
        System.out.println("Default Constructor of LinkedInAccount Called");
        this.noOfConnections = 0;
        this.noOfProfileViews = 0;
        this.noOfJobsApplied = 0;
    }

    LinkedInAccount(String userName, String email, boolean isPublic, boolean isVerified,
                    String countryOrigin, int posts, int likes, int comments,
                    String createdAt, int impressions,
                    int connections, int profileViews, int jobsApplied) {
        super(userName, email, isPublic, isVerified, countryOrigin, posts, likes, comments, createdAt, impressions);
        System.out.println("Parameterized Constructor of LinkedInAccount Called");
        this.noOfConnections = connections;
        this.noOfProfileViews = profileViews;
        this.noOfJobsApplied = jobsApplied;
    }

    int getNoOfConnections() {
		return noOfConnections;
	}

	void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}

	int getNoOfProfileViews() {
		return noOfProfileViews;
	}

	void setNoOfProfileViews(int noOfProfileViews) {
		this.noOfProfileViews = noOfProfileViews;
	}

	int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}

	void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}

	void displayLinkedIn() {
        System.out.println("\nLinkedIn Account Details");
        super.display();
        System.out.println("No. of Connections: " + this.noOfConnections);
        System.out.println("No. of Profile Views: " + this.noOfProfileViews);
        System.out.println("No. of Jobs Applied: " + this.noOfJobsApplied);
    }
}//linkedinaccount ends here

class YouTubeAccount extends SocialMediaAccount {
    int noOfSubscribers;
    double watchTime;
    boolean isMonetized;
    double estimatedRevenue;

    YouTubeAccount() {
        super();
        System.out.println("Default Constructor of YouTubeAccount Called");
        this.noOfSubscribers = 0;
        this.watchTime = 0.0;
        this.isMonetized = false;
        this.estimatedRevenue = 0.0;
    }

    int getNoOfSubscribers() {
		return noOfSubscribers;
	}

	void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	double getWatchTime() {
		return watchTime;
	}

	void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}

	boolean isMonetized() {
		return isMonetized;
	}

	void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}

	double getEstimatedRevenue() {
		return estimatedRevenue;
	}

	void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}

	YouTubeAccount(String userName, String email, boolean isPublic, boolean isVerified,
                   String countryOrigin, int posts, int likes, int comments,
                   String createdAt, int impressions,
                   int subscribers, double watchTime, boolean monetized, double revenue) {
        super(userName, email, isPublic, isVerified, countryOrigin, posts, likes, comments, createdAt, impressions);
        System.out.println("Parameterized Constructor of YouTubeAccount Called");
        this.noOfSubscribers = subscribers;
        this.watchTime = watchTime;
        this.isMonetized = monetized;
        this.estimatedRevenue = revenue;
    }

    void displayYouTube() {
        System.out.println("\nYouTube Account Details");
        super.display();
        System.out.println("No. of Subscribers: " + this.noOfSubscribers);
        System.out.println("Watch Time: " + this.watchTime);
        System.out.println("Monetized: " + this.isMonetized);
        System.out.println("Estimated Revenue: ₹" + this.estimatedRevenue);
    }
}//youtubeaccount ends here


// Main Class
class SocialMain {
    public static void main(String[] args) {
        InstagramAccount insta = new InstagramAccount("Yash", "yash@gmail.com", true, true, "India",
                200, 5000, 800, "2020-01-01", 12000, 1000, 500, 15, 50, 20, 10);
        insta.displayInstagram();

        LinkedInAccount link = new LinkedInAccount("Raj", "raj@gmail.com", true, true, "India",
                100, 2000, 150, "2018-05-05", 8000, 500, 200, 20);
        link.displayLinkedIn();

        YouTubeAccount yt = new YouTubeAccount("Amit", "amit@gmail.com", true, true, "India",
                300, 15000, 2500, "2019-10-10", 20000, 20000, 5000.5, true, 150000.75);
        yt.displayYouTube();
    }//main ends here
}//socialmain ends here
