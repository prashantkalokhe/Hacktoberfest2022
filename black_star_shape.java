    int radius[] = {118,40,90,40};
    int nPoints = 16;
    int[] X = new int[nPoints];
    int[] Y = new int[nPoints];
    int midX = 500;
    int midY = 340;

    for (double current=0.0; current<nPoints; current++)
    {
        int i = (int) current;
        double y = Math.sin(current*((2*Math.PI)/max))*radius[i % 4];
        double x = Math.cos(current*((2*Math.PI)/max))*radius[i % 4];

        Y[i] = (int) y+midY;
        X[i] = (int) x+midX;
    }

    g.setColor(Color.BLACK);
    g.fillPolygon(X, Y, nPoints);
