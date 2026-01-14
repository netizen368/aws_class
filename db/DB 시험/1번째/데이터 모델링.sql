USE MALL;
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
	`o_id`	int	PRIMARY KEY AUTO_INCREMENT,
	`m_id`	int	NOT NULL,
	`p_id`	int	NOT NULL,
	`o_qty`	int	NULL DEFAULT 0,
	`o_date`	DATETIME	NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE `orders` ADD CONSTRAINT `FK_member_TO_orders_1` FOREIGN KEY (
	`m_id`
)
REFERENCES `member` (
	`m_id`
);
ALTER TABLE `orders` ADD CONSTRAINT `FK_product_TO_orders_1` FOREIGN KEY (
	`p_id`
)
REFERENCES `product` (
	`p_id`
);

