CREATE TABLE if not exists iLiftSets (
		setId int PRIMARY KEY, date date,
		start datetime, end datetime,
        length int,
        exercise varchar(255),
        mgroup varchar(255),
        weightLb int,
        reps int);

SELECT * FROM iLiftSets;