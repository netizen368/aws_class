USE MALL;
DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`m_id`	int	PRIMARY KEY,
	`m_name`	varchar(20)	NOT NULL,
	`m_point`	int	NULL DEFAULT 0
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`p_id`	int	PRIMARY KEY,
	`p_name`	varchar(50)	NULL,
	`p_price`	int	NULL,
	`p_stock`	int	NULL
);
