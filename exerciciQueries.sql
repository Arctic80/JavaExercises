-- Exercici 1
SELECT COUNT(*)
FROM flights;

-- Exercici 2
SELECT a.airport, AVG(DepDelay), AVG(ArrDelay)
FROM flights f, usairports a
WHERE f.origin = a.iata
GROUP BY f.origin;

-- Exercici 3
SELECT f.Origin, f.colYear, f.colMonth, AVG(ArrDelay) as retrasoSalida
FROM flights f
GROUP BY f.origin, f.colMonth
ORDER BY f.origin, f.colYear, f.colMonth;

-- Exercici 4
SELECT a.city, f.Origin, f.colYear, f.colMonth, AVG(ArrDelay) as retrasoSalida
FROM flights f, usairports a
WHERE f.origin = a.iata
GROUP BY f.origin, f.colMonth
ORDER BY f.origin, f.colYear, f.colMonth;

-- Exercici 5
SELECT c.Description, f.UniqueCarrier, COUNT(*) 
FROM flights f, carriers c 
WHERE f.cancelled IS TRUE AND f.UniqueCarrier = c.CarrierCode
GROUP BY f.UniqueCarrier DESC;

-- Exercici 6
SELECT f.UniqueCarrier, f.FlightNum, SUM(f.distance) AS distance
FROM flights f
GROUP BY f.UniqueCarrier, f.FlightNum
ORDER BY distance DESC
LIMIT 10;

-- Exercici 7
WITH 
	retrasosCarrier AS (
	SELECT f.UniqueCarrier, AVG(f.ArrDelay) AS retraso
	FROM flights f
	GROUP BY f.UniqueCarrier
	)
SELECT UniqueCarrier, retraso
FROM retrasosCarrier
WHERE retraso > 10
ORDER BY retraso DESC;





















