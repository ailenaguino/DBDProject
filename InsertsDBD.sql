use dbdbd;

insert into survivor (foto_surv, nombre_surv) values
("portrait_yui", "Yui Kimura"),
("portrait_feng", "Feng Min"),
("portrait_dwight", "Dwight Fairfield");

insert into perk_s (foto_p_s, nombre_p_s, survivor_id_surv) values
("perk_AnyMeansNecessary", "Any Means Necessary", 1),
("perk_Breakout", "Breakout", 1),
("perk_LuckyBreak", "Lucky Break", 1),
("perk_Alert", "Alert", 2),
("perk_Lithe", "Lithe", 2),
("perk_Technician", "Technician", 2),
("perk_Bond", "Bond", 3),
("perk_ProveThyself", "Prove Thyself", 3),
("perk_Leader", "Leader", 3);